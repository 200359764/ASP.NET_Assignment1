﻿using System.Web;
using System.Web.Mvc;

namespace High_M_Music_Records
{
    public class FilterConfig
    {
        public static void RegisterGlobalFilters(GlobalFilterCollection filters)
        {
            filters.Add(new HandleErrorAttribute());
        }
    }
}
