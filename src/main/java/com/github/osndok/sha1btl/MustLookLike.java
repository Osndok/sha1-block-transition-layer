package com.github.osndok.sha1btl;

/**
 * Created by robert on 2015-11-01 16:07.
 */
class MustLookLike
{
	/**
	 * Throws a NullPointerException or IllegalArgumentException if the given byte array does not fit the proper
	 * sha1 hex code length.
	 *
	 * @param bytes
	 */
	public static
	void aSha1HashCode(byte[] bytes)
	{
		if (bytes.length!=20)
		{
			throw new IllegalArgumentException("sha-1 hash code should be 20 bytes (40 hex characters)");
		}
	}
}
