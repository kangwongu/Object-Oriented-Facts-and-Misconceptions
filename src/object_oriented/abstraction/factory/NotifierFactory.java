package object_oriented.abstraction.factory;

import object_oriented.abstraction.abstrac.Notifier;

public interface NotifierFactory {

    static NotifierFactory instance() {
        return new NotifierFactoryImpl();
    }

    Notifier getNotifier(String type);
}
