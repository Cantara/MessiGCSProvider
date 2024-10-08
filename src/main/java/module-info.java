module messi.provider.gcs {
    requires messi.sdk;
    requires messi.filesystem.provider;
    requires property.config;

    requires org.apache.avro;

    requires com.google.auth.oauth2;
    requires com.google.auth;
    requires gax;
    requires google.cloud.core;
    requires google.cloud.storage;

    provides no.cantara.messi.api.MessiClientFactory with no.cantara.messi.cloudstorage.GCSMessiClientFactory;

    exports no.cantara.messi.cloudstorage;
}
