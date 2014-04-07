package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * Demo of Streams API
 *
 * Created by yfain11 on 4/4/14.
 */

public class StreamsAndBeer {

    // Populate beer collection
    static List<Beer> loadCellar(){
        List<Beer> beerStock = new ArrayList<>();

        beerStock.add(new Beer("Stella", "Belgium", 7.75f));
        beerStock.add(new Beer("Sam Adams", "USA", 7.00f));
        beerStock.add(new Beer("Obolon", "Ukraine", 4.00f));
        beerStock.add(new Beer("Bud Light", "USA", 5.00f));
        beerStock.add(new Beer("Leffe Blonde", "Belgium", 8.75f));
        beerStock.add(new Beer("Chimay Blue", "Belgium", 10.00f));
        beerStock.add(new Beer("Brooklyn Lager", "USA", 8.25f));

        return beerStock;
    }

    public static void main(String[] args) {

        List<Beer> beers = loadCellar();                  // populate the beer collection
        List<Beer> preferredBeers = new ArrayList<>();    // I like Belgium beers
        List<Beer> americanBeers = new ArrayList<>();     // Some like American beers
        List<Beer> expensiveAmericanBeers = new ArrayList<>();     // Some like expensive American beers


        // External processing
        for(Beer beer: beers){
            if ("Belgium".equals(beer.country)) {
                preferredBeers.add(beer);
                System.out.println("Found a Belgium beer using external loop for: "+ beer.name);
            }
        }

        System.out.println("\nPreferred beer names from preferredBeers - internal looping with forEach():");
        System.out.println("=====\n");

        preferredBeers.forEach(pbeer -> System.out.println("Preferred beer name: " + pbeer.name));


        preferredBeers.replaceAll(bee -> {
            bee.name += " Octoberfest special ";
            return bee;
        });

        System.out.println("\nApplying replaceAll+lambda to preferredBeers at Octoberfest:");
        System.out.println("=====\n");
        preferredBeers.forEach(pbeer -> System.out.println("Preferred beer name: " + pbeer.name));


        System.out.println("\nBeer names from beers (internal looping with forEach):");
        System.out.println("=====\n");
       // forEach() + lambdas. No streams.
        beers.forEach(beerrr -> System.out.println("Beer name: " + beerrr.name));


        // Adding streams with filter
        americanBeers = beers.stream()                // Turn a collection into a stream
                .filter(brr -> "USA".equals(brr.country))    // Intermediate operation filter
                .collect(Collectors.toList());        // Terminal operation to convert a result into a new collection

        System.out.println("\nBeer names from americanBeers - applied streams and filter country==USA ");
        System.out.println("=====\n");
        americanBeers.forEach(ambr -> System.out.println("American beer name: " + ambr.name));



        // Adding streams with filter
        OptionalDouble averagePrice = beers.parallelStream()
                .filter(brr -> "USA".equals(brr.country))
                .mapToDouble(brrr -> brrr.price)
                .average();        // Combining the results (reducing)

        System.out.println("\nApplied streams, filter, mapToDouble, and average ");
        System.out.println("=====");
        System.out.println("The average beer price of the American beer is $" + averagePrice.getAsDouble());

/*


*/



    }



}
