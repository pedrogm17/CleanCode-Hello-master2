package es.ulpgc.eite.cleancode.helloworld.test;

import android.os.Bundle;

import androidx.test.runner.MonitoringInstrumentation;

import cucumber.api.CucumberOptions;
import cucumber.api.android.CucumberInstrumentationCore;
import es.ulpgc.eite.cleancode.helloworld.BuildConfig;

@CucumberOptions(
    features = "features",
    glue = "es.ulpgc.eite.cleancode.helloworld.test"
)
public class Instrumentation extends MonitoringInstrumentation {

    private final CucumberInstrumentationCore instrumentation =
        new CucumberInstrumentationCore(this);

    @Override
    public void onCreate(Bundle arguments) {
        super.onCreate(arguments);

        String tags = BuildConfig.TEST_TAGS;
        if (!tags.isEmpty()) {
            arguments
                .putString("tags", tags.replaceAll(",", "--")
                .replaceAll("\\s",""));
        }

        instrumentation.create(arguments);
        start();
    }

    @Override
    public void onStart() {
        super.onStart();

        waitForIdleSync();
        instrumentation.start();
    }
}
