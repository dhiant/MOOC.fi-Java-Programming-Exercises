/*
 * Packages:
 * can be defined as a organized group of related types i.e. classes, interfaces, enumerations and annotations
 * that help to prevent naming conficts, manage acess control, make searching and usage of classes, interface and related files easier.
 *
 *
 * Some of the existing  packages in java are:
 *  java.lang - bundles the fundamental classes
 *  java.io   - classes for input/output functions
 *
 *
 * Importance of packages: @NAMC !== NAME
 
 * Namespace Management:
 * By organizing code into packages, developers can ensure that class names within a package are unique and easily identifiable.
 
 * Access Control:
 * Packages facilitate access control by allowing the use of access modifiers. Classes within the same package have default access,
 * which means they can be accessed by other classes within the same package without explicitly specifying access modifiers.
 
 * Modularity and Code Organization:
 * Code related to specific functionalities or modules can be grouped together within a package, making it easier to manage and maintain.
 * This makes the codebase more organized and structured.
 
 * Code Sharing and Reusability:
 * Packages provide a way to share code libraries and frameworks by packaging them into reusable components.
 * Developers can create libraries and distribute them as packages, allowing other developers to incorporate and utilize the functionality
 * provided by those packages in their applications.
 */

package P1;

public class A {

  public void show() {
    System.out.println("This is from the class A of package 1.");
  }
}
