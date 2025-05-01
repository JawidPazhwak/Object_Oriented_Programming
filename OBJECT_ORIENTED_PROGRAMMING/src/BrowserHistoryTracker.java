public class BrowserHistoryTracker {
    private int id;
    private static int counter;
    public URL firstUrl;

    public BrowserHistoryTracker(){
        id = ++ counter;
    }
    public void visit(URL url){
        if(firstUrl == null){
            firstUrl = url;
            System.out.println("Loading .... " + url.url);
        }
        else{
            URL current = firstUrl;
            while(current.nextUrl != null){
                current = current.nextUrl;
            }
            current.nextUrl = url;
            System.out.println("Loading .... " + url.url);
        }
    }
    public void showHistory(){
        System.out.println("ID: " + id);
        System.out.println("Loading History .... ");
        if(firstUrl == null){
            System.out.println("No history");
        }
        else{
            URL current = firstUrl;
            while(current != null){
                System.out.println("Visited Url: " + current.url);
                current = current.nextUrl;
            }
        }
    }
    public void deleteHistory(URL u){
        if(firstUrl.equals(u)){
            firstUrl = null;
            System.out.println(u.url + " removed");
        }
        else{
            URL current = firstUrl;
            while(current.nextUrl != null && !current.nextUrl.equals(u)){
                current = current.nextUrl;
            }
            current.nextUrl = current.nextUrl.nextUrl;
            System.out.println(u.url + " removed");
        }
    }
}
