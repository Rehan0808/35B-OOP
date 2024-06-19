
public class ConstructorRevise {
    public static void main(String[] args) {
        NonParameterizedConstructor np = new NonParameterizedConstructor();
        System.out.println(np.data2);

        ParameterizedConstructor pc = new ParameterizedConstructor(18, "Ram2");
        System.out.println(pc.data2);

        pc.data2 = "Changing";
        // pc.data1 = 100;
        pc.setData1(100);
        // System.out.println(pc.data1);
        System.out.println(pc.getData1());

        Song s1 = new Song("ABC", 4);
        s1.setId(1);
        s1.setArtists("DJ Khaled");
        s1.Description = "Lorem Ipsum";
        s1.Album = "Dollar";
        s1.setDuration(5);
        System.out.println("Song" + s1.getId());
        System.out.println("Title" + s1.getTitle());
        System.out.println("Duration" + s1.getduration());
        System.out.println("Artists" + s1.getArtists());
        System.out.println("Album" + s1.Album);
        System.out.println("Description" + s1.Description);


    }
}

/* Task
 * Make a class song
 * Make 4 private property id, title, duration and artists
 * Make 2 public property album and description
 * Make constructor to set title and duration only
 * Make setter for id, duration and artists 
 * Make getter for id, title, duration and artists
 * Make 2 object of Song
 * Fill all the attributes
 * Change the duration of 1st object  
 * Change the artist of 2nd object
 * Print the following for both object
 * Output
 * Song 1
 * Title: ABC
 * Duration: 10
 * Artists: XYZ
 * Album: XX
 * Description: Lorem Ipsum
 * Song 2
 * ..  
 */
class Song{
    private int id;
    private String title;
    private int duration;
    private String artists;

    public String Album;
    public String Description;

    void setId(int id){
        this.id = id;
    }

    int getId(){
        return this.id;
    }

    void setDuration(int duration){
        this.duration = duration;
    }

    int getduration(){
        return this.duration;
    }

    void setArtists(String artists){
        this.artists = artists;
    }

    String getArtists(){
        return this.artists;
    }

    String getTitle(){
        return this.title;
    }

    Song(String title, int duration){
        this.title = title;
        this.duration = duration;
    }
}

class ParameterizedConstructor{
    private int data1; // this.data1
    String data2;
    // write only access to private property
    void setData1(int data1){
        this.data1 = data1;
    }
    // read only access to private property
    int getData1(){
        return this.data1;
    }

    ParameterizedConstructor(int data1, String data2){
        this.data1 = data1;
        this.data2 = data2;
    }
}

class NonParameterizedConstructor{
    private int data1;
    String data2;
    NonParameterizedConstructor(){
        data1 = 10;
        data2 = "Ram";
        System.out.println("Running in object creation");
    }
}