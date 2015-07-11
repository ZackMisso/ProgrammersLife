//
//  JobGenerator.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/10/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Player.h"
#import "TimeStamp.h"

@interface JobGenerator : NSObject{
    
}

-(Job*)generateHardJob:(Player*)player :(TimeStamp*)time;
-(Job*)generateMediumJob:(Player*)player :(TimeStamp*)time;
-(Job*)generateEasyJob:(Player*)player :(TimeStamp*)time;
-(NSMutableArray*)generateBatchOfJobs:(Player*)player :(TimeStamp*)time;

@end