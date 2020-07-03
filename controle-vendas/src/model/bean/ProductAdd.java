package model.bean;

public class ProductAdd {
    private int id;
    private int qtd;
    private String description;
    private int id_register_item;

    public int getId_register_item() {
        return id_register_item;
    }

    public void setId_register_item(int id_register_item) {
        this.id_register_item = id_register_item;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
