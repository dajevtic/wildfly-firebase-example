package de.elb.wildfly.firebase.app;

import com.google.firebase.FirebaseApp;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.omnifaces.cdi.Eager;
import org.slf4j.Logger;

@Eager
@ApplicationScoped
public class FirebaseApplication {

    @Inject
    private Logger log;

    private FirebaseApp firebaseApp;

    @PostConstruct
    public void onCreate() {
        firebaseApp = FirebaseApp.getInstance();
    }

    public FirebaseApp getFirebaseApp() {
        return firebaseApp;
    }

    @PreDestroy
    public void preDestroy() {
        log.debug("Performed some cleanup here");
    }

}
