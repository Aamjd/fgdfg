/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * NoticeBoard – This class contains the details of the noticeboard and its information.
 *
 * Attributes:
 * • NewsList – List of all news and information
 * • InchargeName – Name of the person in charge of the notice board
 *
 * Methods:
 * • Display() – Displays all the news from the notice board.
 * • AddContent() – Adds new content to the notice board.
 */
public class NoticeBoard {
   // Attributes
    private List<String> NewsList;
    private String InchargeName;

    // Constructor
    public NoticeBoard(){
        this.NewsList = new ArrayList<>();
    }
  

    //Method to  Add a new piece of content (news, event) to the notice board.
    public void AddContent(String content) {
        this.NewsList.add(content);
        System.out.println("Notice Board (" + this.InchargeName + ") Updated: \"" + content + "\"");
    }
    
    // Displays all content currently on the notice board.
    public void Display() {
        System.out.println("\n--- School Notice Board ---");
        System.out.println("--- In Charge: " + this.InchargeName + " ---");
        if (NewsList.isEmpty()) {
            System.out.println("  No news to display.");
        } else {
            for (String news : NewsList) {
                System.out.println("  • " + news);
            }
        }
    }

    // --- Getters and Setters ---------------------------------------------

    public List<String> getNewsList() {
        return NewsList;
    }

    public void setNewsList(List<String> NewsList) {
        this.NewsList = NewsList;
    }

    public String getInchargeName() {
        return InchargeName;
    }

    public void setInchargeName(String InchargeName) {
        this.InchargeName = InchargeName;
    }
  
}
