public class RottenPotato {

    public static void main(String[] args) {

        int[][] ratings = { {4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7} };

        System.out.println("Movie zero's average rating: " + movieAvgRating(ratings, 0));                    
        System.out.println("Movie one's average rating: " + movieAvgRating(ratings, 1));    
        System.out.println("Reviewer zero's average rating: " + reviewerAvgRating(ratings, 0));    
        System.out.println("Reviewer one's average rating: " + reviewerAvgRating(ratings, 1));
        System.out.println("Average rating for all movies in 2018: " + avgRating2018(ratings));    
        System.out.println("Hardest reviewer is #" + hardestReviewer2018(ratings));
        System.out.println("Worst movie is #" + worstMovie2018(ratings));
    }

    //Question 1
    public static int movieAvgRating(int[][] ratings, int movie) {
        int result = 0;
        for(int i = 0; i <= ratings.length-1; i++) {
            result = result + ratings[i][movie];
        }
        return result/ratings.length;
    }

    //Question 2
    public static int reviewerAvgRating(int[][] ratings,int reviewer) {
        int result = 0;
        for(int i = 0; i <= ratings[0].length-1; i++) {
            result = result + ratings[reviewer][i];
        }
        return result/ratings[0].length;
    }

    //Question 3
    public static int avgRating2018(int[][] ratings) {
        int result = 0;
        int divider = 0;
        for(int row = 0; row <= ratings.length-1; row++) {
            for(int column = 0; column <= ratings[0].length-1; column++) {
                result = result + ratings[row][column];
                divider++;
            }
        }
        return result/divider;
    }

    //Question 4
    public static int hardestReviewer2018(int[][] ratings) {
        int  hardestReview = 0;
        int hardestAvg = reviewerAvgRating(ratings,0);
        for(int i = 1; i <= ratings.length; i++) {
            int newAvg = reviewerAvgRating(ratings,i);
            if (newAvg < hardestAvg) {
                hardestReview = i;
                hardestAvg = newAvg;
            }
        }
        return hardestReview;
 
    }

    //question 5
    public static int worstMovie2018(int[][] ratings) {
        int worstMovieval = 0;
        int worstAvg = movieAvgRating(ratings, 0);
        for( int w = 1; w <= ratings[0].length; w++) {
            int newAvg = movieAvgRating(ratings, w);
            if (newAvg < worstAvg) {
                worstMovieval = w;
                worstAvg = newAvg;
            }
        }
        return worstMovieval;
                
    }   
}