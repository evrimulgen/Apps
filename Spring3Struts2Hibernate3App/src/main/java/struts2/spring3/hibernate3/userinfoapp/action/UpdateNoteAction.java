package struts2.spring3.hibernate3.userinfoapp.action;
import java.util.Map;
import java.util.List;

import struts2.spring3.hibernate3.userinfoapp.service.INoteService;
import struts2.spring3.hibernate3.userinfoapp.dto.Note;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class UpdateNoteAction extends ActionSupport{
	private String noteId;
	private String userId;
	private String title;
	private String content;
	private INoteService noteService;
	
	public String updateNote(){
		List<Note> notes = noteService.selectNote(noteId);
		for (Note temp : notes) {
			if (content == null){
				temp.setTitle(title);
			}else{
				temp.setContent(content);
			}
			noteService.updateNote(temp);
		}
		
		return SUCCESS;		
	}

	public String getNoteId() {
		return noteId;
	}
	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setNoteService(INoteService noteService){
		this.noteService = noteService;
	}

}
