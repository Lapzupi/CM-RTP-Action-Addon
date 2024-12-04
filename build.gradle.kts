plugins {
    `java`
}

group = "com.dev.lapzupi.cmenu.addon.rtp"
version = "1.0.1"


dependencies {
    compileOnly(libs.paper.api)
    compileOnly(libs.cmenus)
    compileOnly(libs.rtp.api)
}
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
    withSourcesJar()
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
        options.compilerArgs.add("-parameters")
    }
}

