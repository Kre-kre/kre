package chapter12.videolibrary.models;


import java.io.Serial;
import java.io.Serializable;

public abstract class Entity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    protected long id;

    public Entity() {
    }

    public Entity(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entity)) return false;

        Entity entity = (Entity) o;

        return getId() == entity.getId();
    }

    @Override
    public int hashCode() {
        return (int) (getId() ^ (getId() >>> 32));
    }
}

