package com.linux.controller;

import com.linux.view.StringLiterals;

/**
 * Enum Tasks is used to describe tasks1-3 to the user and then provide tutorials for each task using two abstract methods.
 */
public enum Tasks {
  TASK_ONE(StringLiterals.TASK_ONE){
    @Override
    public String tutorial() {
      return StringLiterals.TASK_ONE_TUTORIAL;
    }
  },
  TASK_TWO(StringLiterals.TASK_TWO) {
    @Override
    public String tutorial() {
      return StringLiterals.TASK_TWO_TUTORIAL;
    }
  },
  TASK_THREE(StringLiterals.TASK_THREE){
    @Override
    public String tutorial() {
      return StringLiterals.TASK_THREE_TUTORIAL;
    }
  };

  private final String task;

  Tasks(String task) { //ctor
    this.task = task;
  }

  public String task() {//getter
    return task;
  }

  public abstract String tutorial();

}
