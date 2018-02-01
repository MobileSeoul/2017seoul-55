package com.google.appinventor.common.version;

public final class GitBuildId {
    public static final String ACRA_URI = "${acra.uri}";
    public static final String ANT_BUILD_DATE = "August 15 2017";
    public static final String GIT_BUILD_FINGERPRINT = "1a97efcc5045a292ed29b56b513191abaeaa03d4";
    public static final String GIT_BUILD_VERSION = "nb161a";

    private GitBuildId() {
    }

    public static String getVersion() {
        String version = GIT_BUILD_VERSION;
        if (version == "" || version.contains(" ")) {
            return "none";
        }
        return version;
    }

    public static String getFingerprint() {
        return GIT_BUILD_FINGERPRINT;
    }

    public static String getDate() {
        return ANT_BUILD_DATE;
    }

    public static String getAcraUri() {
        if (ACRA_URI.equals(ACRA_URI)) {
            return "";
        }
        return ACRA_URI.trim();
    }
}
