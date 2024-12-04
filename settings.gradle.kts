rootProject.name = "CM-RTP-Action-Addon"


dependencyResolutionManagement {
    repositories {
        maven("https://repo.papermc.io/repository/maven-public/")
        maven("https://oss.sonatype.org/content/groups/public/")
        maven("https://jitpack.io")
        maven("https://repo.minebench.de/")
    }
    versionCatalogs {
        create("libs") {
            library("paper-api","io.papermc.paper:paper-api:1.21.1-R0.1-SNAPSHOT")
            library("cmenus","com.github.Lapzupi:ConfigurableMenus:0.4.1")
            library("rtp-api", "com.github.Lapzupi.RandomTeleport:randomteleport-api:2.1.0.1")
        }
    }
}
