package Flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvisibilityPotion implements Potion {
    private static final Logger LOGGER = LoggerFactory.getLogger(InvisibilityPotion.class);

    @Override
    public void drink() {
        LOGGER.info("You become invisible. (Potion={})", System.identityHashCode(InvisibilityPotion.class));
    }
}
