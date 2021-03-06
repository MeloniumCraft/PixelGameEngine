package net.meloniumcraft.pge.core.types;

import net.meloniumcraft.pge.backend.PGEBackend;

public final class Decal {
    private static PGEBackend backend;
    private final int id;
    private final Sprite sprite;
    public VF2D uvScale;
    
    public Decal(Sprite base) {
        this.id = backend.CreateDecal(base);
        this.sprite = base;
        this.uvScale = new VF2D(1.f / sprite.getWidth(), 1.f / sprite.getHeight());
    }
    
    public static void setBackend(PGEBackend backend) {
        if (Decal.backend != null)
            throw new IllegalStateException("Decal: Tried to reassign the backend!");
        Decal.backend = backend;
    }
    
    public int getId() {
        return id;
    }
    
    public Sprite getSprite() {
        return sprite;
    }
}
