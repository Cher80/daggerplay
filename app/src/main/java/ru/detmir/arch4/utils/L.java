package ru.detmir.arch4.utils;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class L {

	private enum LogType {
		v, d, i, w, e
	}

	public static String GLOBAL_TAG = "ooo";

	interface LogReceiver {
		void log(@NonNull LogType type, @Nullable String tag, @Nullable String msg);

		void log(@NonNull LogType type, @Nullable String tag, @Nullable String msg, @Nullable Throwable tr);
	}


	private static final LogReceiver DEFAULT_LOG_RECEIVER = new LogReceiver() {

		@Override
		public void log(@NonNull LogType type, @Nullable String tag, @Nullable String msg) {
			switch (type) {
				case v:
					Log.v(tag, msg);
					break;
				case d:
					Log.d(tag, msg);
					break;
				case i:
					Log.i(tag, msg);
					break;
				case w:
					Log.w(tag, msg);
					break;
				case e:
					Log.e(tag, msg);
					break;
			}
		}

		@Override
		public void log(@NonNull LogType type, @Nullable String tag, @Nullable String msg, @Nullable Throwable tr) {
			switch (type) {
				case v:
					Log.v(tag, msg, tr);
					break;
				case d:
					Log.d(tag, msg, tr);
					break;
				case i:
					Log.i(tag, msg, tr);
					break;
				case w:
					Log.w(tag, msg, tr);
					break;
				case e:
					Log.e(tag, msg, tr);
					break;
			}
		}
	};

	@NonNull
	private static LogReceiver logReceiver = DEFAULT_LOG_RECEIVER;

	// ---------- P U B L I C ----------
	// --- v ---

	public static void v(@Nullable final Throwable e, @NonNull final Object... o) {
		log(LogType.v, e, o);
	}

	public static void v(@NonNull final Object... o) {
		log(LogType.v, o);
	}

	// --- d ---

	public static void d(@Nullable final Throwable e, @NonNull final Object... o) {
		log(LogType.d, e, o);
	}

	public static void d(@NonNull final Object... o) {
		log(LogType.d, o);
	}

	// --- i ---

	public static void i(@Nullable final Throwable e, @NonNull final Object... o) {
		log(LogType.i, e, o);
	}

	public static void i(@NonNull final Object... o) {
		log(LogType.i, o);
	}

	// --- w ---

	public static void w(@Nullable final Throwable e, @NonNull final Object... o) {
		log(LogType.w, e, o);
	}

	public static void w(@NonNull final Object... o) {
		log(LogType.w, o);
	}

	// --- e ---

	public static void e(@Nullable final Throwable e, @NonNull final Object... o) {
		log(LogType.e, e, o);
	}

	public static void e(@NonNull final Object... o) {
		log(LogType.e, o);
	}

	// ---------- P R I V A T E ----------

	private static void log(@NonNull LogType logType, @Nullable final Throwable e, @NonNull final Object... o) {
		if (isLogEnable()) {
			StringBuilder builder = new StringBuilder();
			for (Object object : o) {
				builder.append(object).append(" ");
			}
			log(logType, builder.toString(), e);
		}
	}

	private static void log(@NonNull LogType logType, @NonNull final Object... o) {
		log(logType, null, o);
	}

	private static void log(@NonNull LogType logType, @Nullable final String message, @Nullable final Throwable e) {
		if (isLogEnable()) {
			StringBuilder messageSb = new StringBuilder();

			StackTraceElement element = trace();
			String className = "";
			String methodName = "";
			int lineNumber = -1;
			if (element != null) {
				methodName = element.getMethodName();
				lineNumber = element.getLineNumber();
				className = element.getClassName();
			} else {
				className = L.class.getName();
			}

			messageSb.append("[").append(Thread.currentThread().getName()).append("] ");
			messageSb.append(className.startsWith("ru.detmir.dmbonus") ?
					className.substring("ru.detmir.dmbonus".length()) : className);
			messageSb.append(".").append(methodName);
			messageSb.append("/");
			messageSb.append(lineNumber);
			messageSb.append(" ");
			messageSb.append(message);

			if (e == null) {
				logReceiver.log(logType, GLOBAL_TAG, messageSb.toString());
			} else {
				logReceiver.log(logType, GLOBAL_TAG, messageSb.toString(), e);
			}
		}
	}

	@Nullable
	private static StackTraceElement trace() {
		StackTraceElement[] e = Thread.currentThread().getStackTrace();
		boolean found = false;
		for (StackTraceElement s : e) {
			if (s.getClassName().equals(L.class.getName())) {
				found = true;
			}
			if (found && !s.getClassName().equals(L.class.getName())) {
				return s;
			}
		}
		return null;
	}

	private static boolean isLogEnable() {
		return true;
	}
}