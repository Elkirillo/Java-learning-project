package main.java.learning.lessons;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.subjects.PublishSubject;

public class RxLesson {
    public static void main(String[] args) {
        Observable<Object> values = Observable.create(subscriber -> {
            subscriber.onNext("Banana");
            subscriber.onNext("Onion");
            subscriber.onNext("Berry");
            subscriber.onNext("Bread");
            subscriber.onCompleted();
            subscriber.onError(new Throwable("Something happened"));
        }).filter(s -> s.equals("Banana") || s.equals("Onion"));

        Subscription subscription = values.subscribe(
                v -> System.out.println("I'm gonna eat today: "+ v)
        );

    }
}

/**/