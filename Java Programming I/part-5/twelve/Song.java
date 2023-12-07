package twelve;

public class Song {

  private String artist;
  private String name;
  private int durationInSeconds;

  public Song(String artist, String name, int durationInSeconds) {
    this.artist = artist;
    this.name = name;
    this.durationInSeconds = durationInSeconds;
  }

  //   notice here parameter of equals method is Object type
  //  thus we use Object name_of_object_to_compare
  //  Java built-in equals method compares two object by references.
  //  so we're overriding built-in equals method to add our custom logic to check the internal state/values of object in their memory references
  @Override
  public boolean equals(Object compared) {
    //  comparing by reference
    //  compare if two objects are in same position i.e. if they hold same references they are equal/same
    //  use double equal sign to check the reference of objects

    if (this == compared) {
      return true;
    }
    //  check if an object is an instance of other
    if (!(compared instanceof Song)) {
      return false;
    }

    //  convert compared object to another-type (Comparing Object) here Song Object-type
    Song comparedSong = (Song) compared;
    // comparing the internal state of two objects
    return (
      this.artist.equals(comparedSong.artist) &&
      this.name.equals(comparedSong.name) &&
      this.durationInSeconds == comparedSong.durationInSeconds
    );
  }

  @Override
  public String toString() {
    return (
      this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)"
    );
  }
}
