public class Romance extends Book{    private int seriesofbooks;
    public Romance(String title, int pages, String author, boolean status, int minAge,int year,int price,int tom)
    {
        super(title, pages,status,minAge,year,price);
        this.seriesofbooks = seriesofbooks;
    }

    public int getSeriesofbooks() {
        return seriesofbooks;
    }

    public void setSeriesofbooks(int seriesofbooks) {
        this.seriesofbooks = seriesofbooks;
    }

    public String toString() {
        return ("Book title: " + getTitle() + "\nBook's author: " + getAuthor() + "\nBook's pages: "
                + getPages() + " \nmin age:" +getMinAge()+ "\nstatus: " + isStatus() +"\nprice: "+getPrice()+"\nyear:" +getYear()+"\nseries of books number is:"+seriesofbooks+"\n_____________________________"); }



}
