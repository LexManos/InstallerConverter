package uk.gemwire.installerconverter;

import java.nio.file.Path;

import uk.gemwire.installerconverter.resolver.IResolver;

public abstract class Config {

    public static String INSTALLER_VERSION = "2.0.17";
    public static boolean OVERRIDE_INSTALLER_BIG_LOGO = false;

    public static final String ICON = "data:image/png;base64,AAABAAMAMDAAAAEACACoDgAANgAAACAgAAABAAgAqAgAAN4OAAAQEAAAAQAIAGgFAACGFwAAKAAAADAAAABgAAAAAQAIAAAAAAAACQAAAAAAAAAAAAAAAQAAAAAAAPX08wBMOSoAvbaxANPOywD6+fkAPioZAK+noADW0s4AnpSMAP39/ADFv7oAtKymAGpaTQDa19QA29fUAEs4KACEd20A9fT0AOPg3QCropsATz0uAPn49wCJfHMA5+XjAD4qGgDo5eMAPyoaAGVVSACMgHYA/f39AMW/uwD+/f0As6ukAEMvIADa1tIAopiQAJCFfADv7uwAt7CqALiwqgBtXlEAzsjEAPTz8gBLOCkAcmNXAOPg3gBhUEMA5uThAD0pGACdk4sAxL65AEEuHgDr6ecAQi4eAGlZTADa1tMAj4R6AO/u7QDw7u0ApZyUAG5eUgDf29kAu7SuAIN2bACqoZoAX09BANDMyADRzMgA9/f2AE88LQD49/YAwLm0AD0pGQA+KRkAnJKJAGRURwCLf3UA/Pz8AEEtHACyqqMAemxhAOvp6ADZ1dEAoZePAEUyIgC3r6kA3drXAIJ1agBxYlYAYE9CAId6cAD49/cAnJKKAJ2SigD7+/oAQS0dAOro5gDZ1dIAV0U3AH5wZQBGMiMAbV1RAMvGwQDe2tgAXEo9AEk2JgC6s60A4d7bAKmgmQD39vUA5ePhAObj4QBkU0YA1dDNAPv7+wD8+/sAsamiANjU0ACglo4AaFhMAP///gCPg3oARDEhALauqADc2dYA3dnWAPLx8ABJNicAqJ+XALuzrgCXjIMA9/b2AK2knQDUz8sAm5GJAJyRiQD6+vkAUT8wAOnn5QBALBwAQSwcANjU0QDZ1NEAVkQ2AP///wDu7OsAo5qSAMrFwADd2dcA8fDuAEg1JQC5sqwAb2BTAODd2gCpn5gA5eLgAIl9cwA/KxoA+/r6AOrn5gBVQzQAjoJ5AO3r6QC1racAa1tOANvY1QDc2NUAy8XBAM7JxACWi4IATTosAFA+LwDBu7YA+vn4AMK7tgA/KxsA6ObkAEArGwBmVkkA/v7+AFVDNQD//v4Ae25jAHxuYwDt6+oARDAhANrX0wBrW08AycS/AEc0JAC5sasA39zZAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABfX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX1+MjIyMX19fX19fX19fX19fX4uMjIxfX19fX19fX19fX19fX19fX19fX19fX19frwyje3smtjUYi19fX19fi52vcCB7ewsbr19fX19fX19fX19fX19fX19fX19fX19fBT8dkJCQE0wsqjWvGq9ff0uhOIiQkHO3BV9fX19fX19fX19fX19fX19fX19fX19fBT8dkJCQQBA5jT6aUzt7QzqAEB2QkHK3BV9fX19fX19fX19fX19fX19fX19fX19fnaSikJCQN1hVkJCQkJCQkAc8ApCQkBlLr19fX19fX19fX19fX19fX19fX19fX19fX195RpCQkLBsv5CQkJCQJRMHkJCQAFqLX19fX19fX19fX19fX19fX19fX19fX19fX4tUklFekJBbm16QkJC1ipWQswAvhyFOX19fX19fX19fX19fX19fX19fX19fX19fX1+LVGhXZh2QeJCQkJCQs5CwdiiPeotfX19fX19fX19fX19fX19fX19fX19fX19fX19fX69Jq7yQkJCQkJCQkCpQGBixX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fMJyQkJCQkJCQkKe9i19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fSBaQkJCQkJCQkISxX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fTouxr69JKwqQkJCQkJCQkE+LX19fX19fX19fX19fX19fX19fX19fX19fX19fXxqLloliaEEsvnOQkJCQkJCQkIUBi19fX19fX19fX19fX19fX19fX19fX19fX1+dZFhAqL8XNJFEkJCQkJCQkJCQkIO3BV9fX19fX19fX19fX19fX19fX19fX19fi4uyaiqQkJCQkJCQkJCQkJCQkJCQkJADoK9fX19fX19fX19fX19fX19fX19fX1+vK6mfkJCQkJBbBJAJs5CQkJCQkJCQkJCQPhQaX19fX19fX19fX19fX19fX19fX68urnKQkJCQkJAtJZCKiJCQkJCQkJCQkJCQHzJZnYtfX19fX19fX19fX19fX1+LNWNrkJCQkJCQkJCTYLMpW5CQkJCQkJCQkJCQkJASJImvGotfX19fX19fX19fX69phn6QkJCQkJCQkLUGGa0LRpCQkJCQkJCQkJCQkJCQTQ4xdw+Li4uLX19fX19fi7Qnc5CQkJCQkJCQkASCsDoIFZCQs15tlVFvv3VCvKyXdBMjHDarRRQBNV9fX19fX2VdXUpKSkpKSkpKXIK7HkdMBJCQs54RlbiKbi1rPVZ8pg4OpZRnZ5mBlk5fX19fX4saGBgYGBgYGBgYGBg1D72YcY6NjVJhYSI3Nzc3ug0NDQ0NDQ0NDX0nll9fX19fX19fX19fX19fX19fX19fi4u5KwEBAQEBAQEBAQEBAQEBAQEBAQEBAQF/M19fX19fX19fX19fX19fX19fX19fX19fi4uLi4uLi4uLi4uLi4uLi4uLi4uLi4uLX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX19fX18AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAoAAAAIAAAAEAAAAABAAgAAAAAAAAEAAAAAAAAAAAAAAABAAAAAAAAzsnFAPX08wBMOSoAc2RYAGJRRACJfHIA+vn5AD4qGQDs6ugA29fUAFhHOQBZRzkAbl9TAODc2gDNyMMAlYqBALy1rwDj4N0A+Pj3AE89LgD5+PcAUD0uAD4qGgA/KhoA1tLPANfSzwCMgHYAVEI0AP79/QDa1tIAkYV8AO/u7AC4sKoAXEs9AHJjVwBhUEMA0s3KAFA9LwCvpp8A1dHNAPz8+wDEvrkAQi4eANrW0wBYRjgAycO/AH5xZgBHMyQAlImAAPj39gDAubQA5uTiAD0pGQDn5OIAPikZAGRURwBlVEcA1tHOAPz8/ADFvroAemxhAOvp6ABWRTYARTIiALevqQB/cWcAbF1QAN3a1wDz8vEASjcoALu0rwCYjYQAh3pwAJ2SigBSQDEAw724AEEtHQDZ1dIAV0U3AEYyIwCkm5MAy8bBAN7a2ADh3tsA9vb1APf29QB0ZloA5uPhAEAsGwD8+/sA6+jnAMfBvABFMSEA7uzqAGtcTwDd2dYAWkk7APLx8ABJNicAcGFVAL63sQBOOy0AraSdAPr6+QBRPzAAQCwcAEEsHADY1NEA////AMfBvQB8b2QA3dnXAEg1JQCCdGoA4N3aAPb19AC+t7IAdGVZADwnFwCakIcAY1JFAPr6+gCwqKEA19PPAMbAuwBEMCAA29jVANzY1QDKxcEAWkg6AIBzaADy8O8A4N3bAJaLggBLOSkAvbawAKyjnAD5+fgAPysbAOjm5ABAKxsA19PQANjT0AD+/v4AVUM1AEQwIQCShn0AubGrAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMKj8/XGlqTExMTExpkT8/KkxMTExMTExMTExMTExMTIo4O4CTeC8WNjYHkYGIUUsEikxMTExMTExMTExMTExMFgMUbFoeh0kFSEdGME1sVQwWTExMTExMTExMTExMTEyMgX9seSZbbGyPbBhQRGyOPlhMTExMTExMTExMTExMTEyKVg1nWVMBbGwGhBJzfmOKTExMTExMTExMTExMTExMTExMkEEJbI9sbGw6QEJKTExMTExMTExMTExMTExMTExMTExYdnEobGxsbENKNGlMTExMTExMTExMTExMTExMTExpjIp2gihsbGxsKX1MTExMTExMTExMTExMTExMTGkXT2gsIXUnbGxsbGw5AmlMTExMTExMTExMTExMTEwXZRptcosIVGxsbGxsbDEuNkxMTExMTExMTExMTExpTCIAKGxsZ48cbGxsbGxsbF83B0xMTExMTExMTExMikV3H2xsbI8RiT2PbGxsbGxsbG88XBZpTExMTExMTGlgdDpsbGxsBi1hJGxsbGxsbGyPbIMgVoYWB4pMTExYLBCLNTMzMzUJZhFkbGw6c11XQycOfDJ6km5uI2lMTExFCk5OTk5OThsLXoUNUl8JHWuOjXt7GY1NK18PikxMTGmMjIyMjIyMaYwWcBUTExMVFRUVFRUVFRUVJWJMTExMTExMTExMTExMTExqaWlpaWlpaWlpaWlpaWlpaUxMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTExMTEwAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACgAAAAQAAAAIAAAAAEACAAAAAAAAAEAAAAAAAAAAAAAAAEAAAAAAADUz8sA5+TiAPr5+QDDvLcAVEIzAEczJADy8e8A0s3JAEMvHwDl4uAAVkQ2APj39wDQy8cAmY6FAEEtHQBUQjQA9vX1AFA+LwBDLyAAl4yDAD8rGwBAKxsA3drXAN7a1wCZjoYAQS0eAO3r6QCkm5MATDorAE06KwCTiH8AXEs9AP7+/gCnnZYA6eflAFZFNgD4+PcAoZePAOvp6ABKNicAfW9kAOfl4wDj4d4Av7mzAJ+VjQBINCUAQzAgAHdpXQBALBsAV0U3APn4+ACLfnQAnpOLAEYyIwBCLh4AraSdAFVDNQCIfHIAQCwcAHhpXgBzZVkAU0EzAN7b2ADOyMQAPioaAD8qGgBOOywAXUw+AP///wDb19QATDkqAFtKPADGwLsAbl9TAPn5+ADZ1dIASjcoAJGFfACNgXcAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAADg4ODg4ODg4ODg4ODg4ODg4ODg4ODg4ODg4ODg4ODg4ODg4ODjoODg4ODjoODg4ODg4ODi4cBUBAQDVGEg4ODg4ODhRDBxs7SS80DEcUDg4ODg46QgMJASQiPisdOg4ODg4ODhQnTTJEGihMOg4ODg4OFQ4RMU4CRBYdFA4ODg4OQSMhFykQREQLOTAVDg4ONjxLREoBBkREICYTOAgZDkYzJSwNHkgqRQA/SDcYHxQOFEBAQDpCBD0EBA8KIy0ODg4ODg4OOjo6Ojo6OjoODg4ODg4ODg4ODg4ODg4ODg4ODg4ODg4ODg4ODg4ODg4ODg4ODg4ODg4ODg4ODg4ODgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA=";

    public static Path LOCAL_MAVEN = Path.of(".cache");

    public static String BASE_MAVEN = "https://files.minecraftforge.net/maven/";

    public static IResolver RESOLVER = (host, artifact) -> null;

}
