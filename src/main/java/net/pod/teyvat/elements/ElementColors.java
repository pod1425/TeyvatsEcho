package net.pod.teyvat.elements;

public enum ElementColors {
    PYRO(0xff6641),
    HYDRO(0x00c0fe),
    CRYO(0x7fffff),
    ELECTRO(0xcb83ff),
    ANEMO(0x31d8a0),
    DENDRO(0x90cd00),
    GEO(0xfcb30c);

    private final int colorHex;
    private final String color;

    ElementColors(int colorHex) {
        this.colorHex = colorHex;
        this.color = Integer.toHexString(colorHex);
    }

    public int get() {
        return colorHex;
    }

    @Override
    public String toString() {
        return color;
    }
}
