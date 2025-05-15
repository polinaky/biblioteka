public class Detective extends Book{
    private String type;
    public Detective(String title, int pages, String author, boolean status, int minAge,int year,int price,String type)
    {
        super(title, pages,status,minAge,year,price);
        this.type = type;
    }



    public String toString() {
        return ("Book title: " + getTitle() + "\nBook's author: " + getAuthor() + "\nBook's pages: "
                + getPages() + " \nmin age: " +getMinAge()+ "\nstatus: " + isStatus() +"\nprice: "+getPrice()+"\nyear: " +getYear()+"\ntype  is:"+type+"\n_____________________________"); }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
