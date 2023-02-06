//Task 1.3: A Custom Listener script that updates the issue description with the issue last comment

import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.jira.event.type.EventType


def issue_manager = ComponentAccessor.getIssueManager()
def comment_manager = ComponentAccessor.getCommentManager()

def issues = event.getIssue()
def last_comment = comment_manager.getLastComment(issues)

log.warn('Last Comment: ' + last_comment)

issues.setDescription(last_comment.body)
issue_manager.updateIssue(ComponentAccessor.getJiraAuthenticationContext().getLoggedInUser(), issues, EventType.ISSUE_UPDATED_ID, false)

log.warn('Updates the issue description with the issue last comment')