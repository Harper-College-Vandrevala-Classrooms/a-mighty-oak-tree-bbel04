package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestOakTree {

  OakTree<Squirrel> tree;

  @BeforeEach
  void setUp() {
    tree = new OakTree<>();
  }

  @Test
  void itWorks() {
    assertEquals(true, true);
  }
}
