package com.linux.controller;

import com.linux.view.StringLiterals;

public enum Tasks {
  TASK_ONE("task1") {
    @Override
    public void execute() {
      System.out.println(StringLiterals.TASK_ONE);
    }
  },
  TASK_TWO("task2") {
    @Override
    public void execute() {
      System.out.println(StringLiterals.TASK_TWO);
    }
  },
  TASK_THREE("task3") {
    @Override
    public void execute() {
      System.out.println(StringLiterals.TASK_THREE);
    }
  };

  private final String task;

  Tasks(String task) { //ctor
    this.task = task;
  }

  public String task() {//getter
    return task;
  }

  public abstract void execute(); //methods for enums


}
