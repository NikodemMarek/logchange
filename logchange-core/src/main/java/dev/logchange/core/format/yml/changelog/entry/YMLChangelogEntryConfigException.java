package dev.logchange.core.format.yml.changelog.entry;

import java.util.Collection;
import org.apache.commons.lang3.tuple.Pair;

public class YMLChangelogEntryConfigException extends RuntimeException {
  public String path;
  public Collection<Pair<String, String>> invalidProperties;

  public static String toString(String path, Collection<Pair<String, String>> invalidProperties) {
    StringBuilder sb = new StringBuilder();
    sb.append("Errors in ").append(path).append(":\n");

    for (Pair<String, String> error : invalidProperties) {
      sb.append("\tUnknown property [")
          .append(error.getLeft())
          .append("] with value ")
          .append(error.getRight())
          .append("\n");
    }

    return sb.toString();
  }

  public YMLChangelogEntryConfigException(String path, Collection<Pair<String, String>> errors) {
    super(toString(path, errors));

    this.path = path;
    this.invalidProperties = errors;
  }
}
