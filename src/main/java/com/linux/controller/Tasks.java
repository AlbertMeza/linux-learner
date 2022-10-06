package com.linux.controller;

import com.linux.view.StringLiterals;

public enum Tasks {
  TASK_ONE(StringLiterals.TASK_ONE),
  TASK_TWO(StringLiterals.TASK_TWO),
  TASK_THREE(StringLiterals.TASK_THREE);

  private final String task;

  Tasks(String task) { //ctor
    this.task = task;
  }

  public String task() {//getter
    return task;
  }

  public String tutorial(){   //help task1 -> TASK_ONE.tutorial() -> returns a string of how to complete the task
   return "";
  }

}
