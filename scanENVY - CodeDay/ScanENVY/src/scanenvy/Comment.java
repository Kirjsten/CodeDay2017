/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanenvy;

/**
 *
 * @author Kirjsten
 */
public class Comment{
    
    private int likes;
    private String comment;
    
    public Comment()
    {
        
    }
    
    public Comment(int likesPass, String commentPass)
    {
        likes = likesPass;
        comment = commentPass;
    }
    
    public int getLikes()
    {
        return likes;
    }
            
    public void setLikes(int likespass)
    {
        likes = likespass;
    }
    public String getComment()
    {
        return comment;
    }
    
    public void setComment(String commentpass)
    {
        comment = commentpass;
    }
}
