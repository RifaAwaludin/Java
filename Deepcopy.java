package com.company;

class Product implements Cloneable{

    private int idproduct;
    private String nameproduct;
    private Categories categories;

    public Product(int idproduct, String nameproduct, Categories categories)
    {
        this.idproduct = idproduct;
        this.nameproduct = nameproduct;
        this.categories = categories;
    }

    public Product(String pg05, String pants, Object category) {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    //Getters and Setters

    public int getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    public String getNameproduct() {
        return nameproduct;
    }

    public void setNameproduct(String nameproduct) {
        this.nameproduct = nameproduct;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }
}

class Categories
{
    private String id;
    private String name;

    public Categories(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(int id) {
        this.id = String.valueOf(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String clothes) {
    }
}

class deepCopy {
    private Object Category;

    public static void main(String args[]) throws CloneNotSupportedException {
        deepCopy main = new deepCopy();
        main.product1();
    }

    public void product1() throws CloneNotSupportedException {
        Categories categories = new Categories("fg05", "clothes");
        Product Male = new Product("pg05", "Pants", Category);
        Product Girl = (Product) Male.clone();

        Girl.getCategories().setId("clothes");
        Girl.setNameproduct("Robi");

        System.out.println(Male);
        System.out.println(Girl);
    }
}