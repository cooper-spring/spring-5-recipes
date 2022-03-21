package com.cooper.chapter021.component;

public interface SequenceDao {

    Sequence getSequence(String sequenceId);

    int getNextValue(String sequenceId);

}
