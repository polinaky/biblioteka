public class Historical extends  Book{
    private int centery;
    public Historical(String title, int pages, String author, boolean status, int minAge,int year,int price,int centery)
    {
        super(title, pages,status,minAge,year,price);
        this.centery = centery;
    }



    public String toString() {
        return ("Book title: " + getTitle() + "\nBook's author: " + getAuthor() + "\nBook's pages: "
                + getPages() + " \nmin age:" +getMinAge()+ "\nstatus: " + isStatus() +"\nprice: "+getPrice()+"\nyear" +getYear()+"\ncentery is:"+centery+"\n_____________________________"); }

    public int getCentery() {
        return centery;
    }

    public void setCentery(int centery) {
        this.centery = centery;
    }
}

