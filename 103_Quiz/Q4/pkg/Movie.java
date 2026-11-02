package pkg;
public class Movie{
    String name;
    double rating;
    int ratingNum;
    int revenue;
    
    public Movie(){
        name="";
        rating=0.0;
        ratingNum=0;
        revenue=0;

    }
    public Movie(String movieName, double movieRating, int movieRatingAmt, int movieRevenue){
        name=movieName;
        rating=movieRating;
        ratingNum=movieRatingAmt;
        revenue=movieRevenue;

    }
    public void movieToString(){
        System.out.println("Movie: "+name);
        System.out.println("Rating: "+rating);
        System.out.println("Number of Ratings: "+ratingNum);
        System.out.println("Revenue: "+revenue);
        System.out.println();
    }
    public String getMovieName(){
        return name;
    }
    public int getRevenue(){
        return revenue;
    }
    public void addRating(double newRating){
        rating=((ratingNum*rating)+newRating)/(ratingNum+1);
        ratingNum+=1;
    }
    public double getRating(){
        return rating;
    }
    public boolean compareRatings(Movie otherMovie){
        double otherRating=otherMovie.getRating();
        if(rating>otherRating){
            return true;
        }
        else{
            return false;
        }
    }
    public String revenueToString(){
        int revenue1=revenue%1000;
        int revenue2=(revenue/1000)%1000;
        int revenue3=(revenue/1000000)%1000;
        String revenueString=""+revenue3+","+revenue2+","+revenue1;
        return revenueString;
    }
    
}