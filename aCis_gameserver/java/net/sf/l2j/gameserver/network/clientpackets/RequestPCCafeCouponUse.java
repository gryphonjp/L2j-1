package net.sf.l2j.gameserver.network.clientpackets;

public final class RequestPCCafeCouponUse extends L2GameClientPacket
{
	@SuppressWarnings("unused")
	private String _str;
	
	@Override
	protected void readImpl()
	{
		_str = readS();
	}
	
	@Override
	protected void runImpl()
	{
	}
}