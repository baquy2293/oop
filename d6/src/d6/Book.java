/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d6;

/**
 *
 * @author abc
 */
public class Book {
    
    private String id, outhors,title,category;

    public Book() {
    }

    public Book(String id, String outhors, String title, String category) {
        this.id = id;
        this.outhors = outhors;
        this.title = title;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOuthors() {
        return outhors;
    }

    public void setOuthors(String outhors) {
        this.outhors = outhors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return  id + "," + outhors + "," + title + "," + category+"\n";
    }
    
    
}
