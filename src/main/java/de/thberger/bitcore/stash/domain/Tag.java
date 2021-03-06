package de.thberger.bitcore.stash.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author thb
 */
@Setter @Getter
public class Tag {

    String id;

    String displayId;

    String latestChangeSet;

    String hash;

}
