// (c) Copyright 2009 Cloudera, Inc.
// Updated by Marcello de Sales (marcello.dsales@gmail.com)
package tfidf;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * All tests for inverted index code
 *
 * @author mdesales
 */
public final class AllTests  {

  private AllTests() { }

  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for the TF-IDF algorithm");

    suite.addTestSuite(WordFreqMapperTest.class);
    suite.addTestSuite(WordFreqReducerTest.class);
    suite.addTestSuite(WordCountsForDocsMapperTest.class);
    suite.addTestSuite(WordCountsForDocsReducerTest.class);

    return suite;
  }

}

