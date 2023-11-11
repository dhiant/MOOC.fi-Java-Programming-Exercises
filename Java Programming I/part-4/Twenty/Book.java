// do not modify the code in the file
package Twenty;

public class Book {

  private String title;
  private int pages;
  private String publishedYear;

  public Book(String title, int pages, String year) {
    this.title = title;
    this.pages = pages;
    this.publishedYear = year;
  }

  public String name() {
    return this.title;
  }

  public int pages() {
    return this.pages;
  }

  public String year() {
    return this.publishedYear;
  }

  public String toString() {
    return this.title + ", " + this.pages + " pages, " + this.publishedYear;
  }
}
