package com.ohayou.liteshop.dto;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author liyan
 * @date 2020/8/18 下午3:27
 */
public class GoodsDetailDto {

    private Long id;

    private String goodsSn;

    private String brief;

    private String title;

    private List<String> galleryList;

    private String detail;

    private String unit;

    private BigDecimal price;

    private BigDecimal discountPrice;

    private BigDecimal weight;

    private String category;

    private List<AttrValueDto> attrValueList;

    private List<GoodsSkuDto> goodsSpecList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }


    public void setGalleryList(List<String> galleryList) {
        this.galleryList = galleryList;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<AttrValueDto> getAttrValueList() {
        return attrValueList;
    }

    public void setAttrValueList(List<AttrValueDto> attrValueList) {
        this.attrValueList = attrValueList;
    }

    public List<GoodsSkuDto> getGoodsSpecList() {
        return goodsSpecList;
    }

    public void setGoodsSpecList(List<GoodsSkuDto> goodsSpecList) {
        this.goodsSpecList = goodsSpecList;
    }

    public List<String> getGalleryList() {
        return galleryList;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
}
