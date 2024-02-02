plugins {
    id("base-android-feature-module")
}

android {
    namespace = BuildConstants.NAMESPACE.plus(".feature").plus(".dashboard")
}