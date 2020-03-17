package model;

import java.util.Random;
import java.util.UUID;

/**
 * <p>
 *     This class (bean) is created in {@link TaskG} everytime the method {@link TaskG#getB()} is called.
 *     property of {@link TaskG} class
 * </p>
 * @author Binyamin Regev
 */
public class BeanB {
    private int id;
    private UUID uuid;

    private Random random;

    public BeanB() {
        this.setId(this.random.nextInt());
        this.setUuid(UUID.randomUUID());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
