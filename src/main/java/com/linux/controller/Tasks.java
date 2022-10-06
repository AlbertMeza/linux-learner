package com.linux.controller;

import com.linux.view.StringLiterals;

public enum Tasks {
  TASK_ONE(StringLiterals.TASK_ONE){
    @Override
    public String tutorial() {
      return StringLiterals.TASK_ONE_TUTORIAL;
    }

    @Override
    public String taskDescription() {
      return StringLiterals.TASK_ONE;
    }
  },
  TASK_TWO(StringLiterals.TASK_TWO) {
    @Override
    public String tutorial() {
      return StringLiterals.TASK_TWO_TUTORIAL;
    }

    @Override
    public String taskDescription() {
      return StringLiterals.TASK_TWO;
    }
  },
  TASK_THREE(StringLiterals.TASK_THREE){
    @Override
    public String tutorial() {
      return StringLiterals.TASK_THREE_TUTORIAL;
    }

    @Override
    public String taskDescription() {
      return StringLiterals.TASK_THREE;
    }
  };

  private final String task;

  Tasks(String task) { //ctor
    this.task = task;
  }

  public String task() {//getter
    return task;
  }

  public abstract String tutorial();  //help task1 -> TASK_ONE.tutorial() -> returns a string of how to complete the ta

  public abstract String taskDescription();
}
