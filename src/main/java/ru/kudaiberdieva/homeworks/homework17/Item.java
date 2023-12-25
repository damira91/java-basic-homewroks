package ru.kudaiberdieva.homeworks.homework17;

class Item<T> {
  T data;
  Item <T> next;
  Item (T data) {
      this.data = data;
  }

}