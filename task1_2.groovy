//Task 1.2: A Script Field that can count the number of sub-tasks in an issue

import com.atlassian.jira.component.ComponentAccessor


def issue_manager = ComponentAccessor.getIssueManager()
def sub_tasks = issue_manager.getSubTaskObjects(issue)

def num_of_tasks = sub_tasks.size()
log.warn('Num of tasks: ' + num_of_tasks)

return num_of_tasks

