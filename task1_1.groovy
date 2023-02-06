//Task 1.1: A Script Field that calculates a value based on two issue fields; (Tip: Create two Number fields)

import com.atlassian.jira.component.ComponentAccessor


def custom_field_manager = ComponentAccessor.getCustomFieldManager()

def first_id = 10100
def second_id = 10090

def first_field = custom_field_manager.getCustomFieldObject(first_id)
def second_field = custom_field_manager.getCustomFieldObject(second_id)

def first_value = issue.getCustomFieldValue(firstField)
log.warn('First Val: ' + first_value)

def second_value = issue.getCustomFieldValue(secondField)
log.warn('Second Val: ' + second_value)

def sum_value = first_value + second_value
log.warn('Total Val: ' + sum_value)

return sum_value