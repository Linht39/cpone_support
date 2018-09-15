package com.lanqiao.bean;

/**
 * @auther Linht
 * @date 2018/9/14 21:12
 */
public class AdvAndCategory {

    private Advertisement advertisement;
    private AdvCategory advCategory;

    public AdvAndCategory() {
    }

    public AdvAndCategory(Advertisement advertisement, AdvCategory advCategory) {
        this.advertisement = advertisement;
        this.advCategory = advCategory;
    }

    public Advertisement getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(Advertisement advertisement) {
        this.advertisement = advertisement;
    }

    public AdvCategory getAdvCategory() {
        return advCategory;
    }

    public void setAdvCategory(AdvCategory advCategory) {
        this.advCategory = advCategory;
    }

    @Override
    public String toString() {
        return "AdvAndCategory{" +
                "advertisement=" + advertisement +
                ", advCategory=" + advCategory +
                '}';
    }
}
