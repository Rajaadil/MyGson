package com.madhatters.mygson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.madhatters.mygson.Gson.DataMoudle;

public class MainActivity extends AppCompatActivity {
    private String json="{\n" +
            "  \"categories\": [\n" +
            "    {\n" +
            "      \"id\": \"5a84279237823b5f5f593eed\",\n" +
            "      \"name\": \"Test\",\n" +
            "      \"commission\": 12,\n" +
            "      \"vehicles\": [\n" +
            "        \"5a84189a37823b20b278612e\"\n" +
            "      ]\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"5a8427ee37823b5f5f593eee\",\n" +
            "      \"name\": \"Test 3\",\n" +
            "      \"commission\": 12,\n" +
            "      \"vehicles\": [\n" +
            "        \"5a84189a37823b20b278612e\",\n" +
            "        \"5a82df8b37823b218a3c2a5e\"\n" +
            "      ]\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"5a84285337823b5f5f593eef\",\n" +
            "      \"name\": \"Edited\",\n" +
            "      \"commission\": 30,\n" +
            "      \"vehicles\": [\n" +
            "        \"5a84189a37823b20b278612e\",\n" +
            "        \"5a82df8b37823b218a3c2a5e\"\n" +
            "      ]\n" +
            "    }\n" +
            "  ],\n" +
            "  \"cities\": [\n" +
            "    {\n" +
            "      \"id\": \"5a82dfdc37823b218a3c2a5f\",\n" +
            "      \"name\": \"Makkah\",\n" +
            "      \"location\": [\n" +
            "        39.85652670898435,\n" +
            "        21.391977059958606\n" +
            "      ]\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"5a8431d037823b6e707401bf\",\n" +
            "      \"name\": \"Riyadh\",\n" +
            "      \"location\": [\n" +
            "        46.68494863552053,\n" +
            "        24.714712844126918\n" +
            "      ]\n" +
            "    }\n" +
            "  ],\n" +
            "  \"vehicles\": [\n" +
            "    {\n" +
            "      \"id\": \"5a82df8b37823b218a3c2a5e\",\n" +
            "      \"name\": \"Car\",\n" +
            "      \"service\": \"5a7c384597a83e5f5b5d38ed\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"5a84189a37823b20b278612e\",\n" +
            "      \"name\": \"Big Car\",\n" +
            "      \"service\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"5acdd0934bc4994a8029dfa8\",\n" +
            "      \"name\": \"Test\",\n" +
            "      \"service\": null\n" +
            "    }\n" +
            "  ],\n" +
            "  \"bank\": \"<p>This is bank <strong>information</strong></p>\"\n" +
            "}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataMoudle dataMoudle=new Gson().fromJson(json,DataMoudle.class);
        Log.d("test","show"+dataMoudle);
    }
}
