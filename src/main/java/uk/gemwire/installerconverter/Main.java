package uk.gemwire.installerconverter;

import java.io.IOException;

import uk.gemwire.installerconverter.util.Jackson;
import uk.gemwire.installerconverter.util.Pair;
import uk.gemwire.installerconverter.v1_5.LibraryInfo;

/**
 * @author RetroGradle
 */
public class Main {

    public static void main(String... args) throws IOException {
        Config config = Config //TODO: WIRING
            .withDefaults()
            .withCachingResolver();

        config.setup();

        //debugLibraryInfo(config, "http://files.minecraftforge.net/maven/", "org.scala-lang:scala-library:2.10.2");
        //debugLibraryInfo(config, "http://files.minecraftforge.net/maven/", "org.scala-lang:scala-compiler:2.10.2");
        //debugLibraryInfo(config, "lzma:lzma:0.0.1");

        try {
            long startTime = System.nanoTime();

            InstallerConverter.convert(config, "1.5.2-7.8.1.738");
            InstallerConverter.convert(config, "1.6.4-9.11.1.965");
            //InstallerConverter.convert(config, "1.12.2-14.23.5.2847");

            long endTime = System.nanoTime();

            System.out.printf("Time taken: %fms \n", (endTime - startTime) * 1e-6);

        } finally {
            config.teardown();
        }
    }

    public static void debugLibraryInfo(Config config, String name) throws IOException {
        debugLibraryInfo(config, null, name);
    }

    public static void debugLibraryInfo(Config config, String host, String name) throws IOException {
        LibraryInfo info = new LibraryInfo();
        if (host != null) info.setUrl(host);
        info.setName(name);
        info.validate();
        System.out.println(Jackson.write(info.convert(Pair.of(config, null), Jackson.factory())));
    }
}
